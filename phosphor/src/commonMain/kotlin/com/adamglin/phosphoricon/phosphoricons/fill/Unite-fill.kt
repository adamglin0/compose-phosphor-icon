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

public val FillGroup.`Unite-fill`: ImageVector
    get() {
        if (`_unite-fill` != null) {
            return `_unite-fill`!!
        }
        `_unite-fill` = Builder(name = "Unite-fill", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 164.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, -151.9f, 3.9f)
                arcToRelative(76.0f, 76.0f, 0.0f, true, true, 79.8f, -79.8f)
                arcTo(76.1f, 76.1f, 0.0f, false, true, 240.0f, 164.0f)
                close()
            }
        }
        .build()
        return `_unite-fill`!!
    }

private var `_unite-fill`: ImageVector? = null
