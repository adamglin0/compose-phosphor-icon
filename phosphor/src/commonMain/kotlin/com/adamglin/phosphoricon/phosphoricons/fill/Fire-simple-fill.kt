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

public val FillGroup.`Fire-simple-fill`: ImageVector
    get() {
        if (`_fire-simple-fill` != null) {
            return `_fire-simple-fill`!!
        }
        `_fire-simple-fill` = Builder(name = "Fire-simple-fill", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(143.38f, 17.85f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -12.63f, 3.41f)
                lineToRelative(-22.0f, 60.41f)
                lineTo(84.59f, 58.26f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.93f, 0.89f)
                curveTo(51.0f, 87.53f, 40.0f, 116.08f, 40.0f, 144.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, false, false, 176.0f, 0.0f)
                curveTo(216.0f, 84.55f, 165.21f, 36.0f, 143.38f, 17.85f)
                close()
            }
        }
        .build()
        return `_fire-simple-fill`!!
    }

private var `_fire-simple-fill`: ImageVector? = null
