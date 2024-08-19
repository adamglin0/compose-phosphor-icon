package com.adamglin.phosphoricon.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.ThinGroup

public val ThinGroup.`Balloon-thin`: ImageVector
    get() {
        if (`_balloon-thin` != null) {
            return `_balloon-thin`!!
        }
        `_balloon-thin` = Builder(name = "Balloon-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 20.0f)
                arcToRelative(84.09f, 84.09f, 0.0f, false, false, -84.0f, 84.0f)
                curveToRelative(0.0f, 22.57f, 9.08f, 47.63f, 24.28f, 67.0f)
                curveToRelative(12.68f, 16.17f, 28.0f, 26.81f, 44.22f, 31.0f)
                lineToRelative(-12.18f, 28.4f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 104.0f, 236.0f)
                horizontalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.68f, -5.58f)
                lineTo(143.5f, 202.0f)
                curveToRelative(16.23f, -4.17f, 31.54f, -14.81f, 44.22f, -31.0f)
                curveToRelative(15.2f, -19.41f, 24.28f, -44.47f, 24.28f, -67.0f)
                arcTo(84.09f, 84.09f, 0.0f, false, false, 128.0f, 20.0f)
                close()
                moveTo(145.93f, 228.0f)
                lineTo(110.07f, 228.0f)
                lineToRelative(10.48f, -24.46f)
                arcToRelative(60.56f, 60.56f, 0.0f, false, false, 14.9f, 0.0f)
                close()
                moveTo(128.0f, 196.0f)
                curveToRelative(-42.1f, 0.0f, -76.0f, -50.33f, -76.0f, -92.0f)
                arcToRelative(76.0f, 76.0f, 0.0f, false, true, 152.0f, 0.0f)
                curveTo(204.0f, 145.67f, 170.1f, 196.0f, 128.0f, 196.0f)
                close()
                moveTo(180.0f, 95.34f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.29f, 4.61f)
                arcToRelative(5.0f, 5.0f, 0.0f, false, true, -0.66f, 0.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.95f, -3.34f)
                arcTo(45.31f, 45.31f, 0.0f, false, false, 135.34f, 60.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.32f, -7.9f)
                arcTo(53.46f, 53.46f, 0.0f, false, true, 180.0f, 95.34f)
                close()
            }
        }
        .build()
        return `_balloon-thin`!!
    }

private var `_balloon-thin`: ImageVector? = null
