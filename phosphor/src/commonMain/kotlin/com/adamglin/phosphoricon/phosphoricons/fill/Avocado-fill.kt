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

public val FillGroup.`Avocado-fill`: ImageVector
    get() {
        if (`_avocado-fill` != null) {
            return `_avocado-fill`!!
        }
        `_avocado-fill` = Builder(name = "Avocado-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(211.0f, 130.66f)
                lineTo(181.2f, 46.47f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, -106.0f, -1.14f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-29.51f, 83.5f)
                arcTo(88.0f, 88.0f, 0.0f, true, false, 211.0f, 130.66f)
                close()
                moveTo(128.0f, 200.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, true, true, 40.0f, -40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 128.0f, 200.0f)
                close()
            }
        }
        .build()
        return `_avocado-fill`!!
    }

private var `_avocado-fill`: ImageVector? = null
