package com.adamglin.phosphoricon.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.FillGroup

public val FillGroup.`Prohibit-fill`: ImageVector
    get() {
        if (`_prohibit-fill` != null) {
            return `_prohibit-fill`!!
        }
        `_prohibit-fill` = Builder(name = "Prohibit-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 128.0f)
                arcToRelative(71.69f, 71.69f, 0.0f, false, true, -15.78f, 44.91f)
                lineTo(83.09f, 71.78f)
                arcTo(71.95f, 71.95f, 0.0f, false, true, 200.0f, 128.0f)
                close()
                moveTo(56.0f, 128.0f)
                arcToRelative(71.95f, 71.95f, 0.0f, false, false, 116.91f, 56.22f)
                lineTo(71.78f, 83.09f)
                arcTo(71.69f, 71.69f, 0.0f, false, false, 56.0f, 128.0f)
                close()
                moveTo(236.0f, 128.0f)
                arcTo(108.0f, 108.0f, 0.0f, true, true, 128.0f, 20.0f)
                arcTo(108.12f, 108.12f, 0.0f, false, true, 236.0f, 128.0f)
                close()
                moveTo(216.0f, 128.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, false, -88.0f, 88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, false, 216.0f, 128.0f)
                close()
            }
        }
        .build()
        return `_prohibit-fill`!!
    }

private var `_prohibit-fill`: ImageVector? = null
