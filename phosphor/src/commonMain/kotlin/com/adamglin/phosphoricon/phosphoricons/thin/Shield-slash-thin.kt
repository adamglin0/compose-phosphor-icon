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

public val ThinGroup.`Shield-slash-thin`: ImageVector
    get() {
        if (`_shield-slash-thin` != null) {
            return `_shield-slash-thin`!!
        }
        `_shield-slash-thin` = Builder(name = "Shield-slash-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(51.0f, 37.31f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 45.0f, 42.69f)
                lineToRelative(1.31f, 1.44f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 51.16f, 24.73f, 82.12f, 45.47f, 99.1f)
                curveToRelative(22.4f, 18.32f, 44.55f, 24.5f, 45.48f, 24.76f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.1f, 0.0f)
                curveToRelative(1.37f, -0.37f, 32.56f, -9.14f, 58.23f, -36.71f)
                lineTo(205.0f, 218.69f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, false, 5.92f, -5.38f)
                close()
                moveTo(128.0f, 227.82f)
                arcToRelative(132.23f, 132.23f, 0.0f, false, true, -41.71f, -23.11f)
                curveTo(58.23f, 181.63f, 44.0f, 150.44f, 44.0f, 112.0f)
                lineTo(44.0f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(53.5f, 52.0f)
                lineTo(181.88f, 193.21f)
                curveTo(160.23f, 216.7f, 133.58f, 226.06f, 128.0f, 227.82f)
                close()
                moveTo(220.0f, 56.0f)
                verticalLineToRelative(56.0f)
                curveToRelative(0.0f, 20.0f, -3.77f, 38.49f, -11.2f, 54.94f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -3.65f, 2.36f)
                arcToRelative(4.06f, 4.06f, 0.0f, false, true, -1.65f, -0.36f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.0f, -5.29f)
                curveToRelative(7.0f, -15.41f, 10.49f, -32.79f, 10.49f, -51.65f)
                lineTo(211.99f, 56.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(98.52f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, true, true, 0.0f, -8.0f)
                lineTo(208.0f, 44.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 220.0f, 56.0f)
                close()
            }
        }
        .build()
        return `_shield-slash-thin`!!
    }

private var `_shield-slash-thin`: ImageVector? = null
