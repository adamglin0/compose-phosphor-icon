package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.`Phone-x`: ImageVector
    get() {
        if (`_phone-x` != null) {
            return `_phone-x`!!
        }
        `_phone-x` = Builder(name = "Phone-x", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(146.34f, 98.34f)
                lineTo(164.69f, 80.0f)
                lineTo(146.34f, 61.66f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, -11.32f)
                lineTo(176.0f, 68.69f)
                lineToRelative(18.34f, -18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 11.32f, 11.32f)
                lineTo(187.32f, 80.0f)
                lineToRelative(18.34f, 18.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, 11.32f)
                lineTo(176.0f, 91.31f)
                lineToRelative(-18.34f, 18.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.32f, -11.32f)
                close()
                moveTo(223.88f, 183.08f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 168.0f, 232.0f)
                curveTo(88.6f, 232.0f, 24.0f, 167.4f, 24.0f, 88.0f)
                arcTo(56.26f, 56.26f, 0.0f, false, true, 72.92f, 32.12f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.62f, 9.52f)
                lineToRelative(21.12f, 47.15f)
                lineToRelative(0.0f, 0.12f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 109.39f, 104.0f)
                curveToRelative(-0.18f, 0.27f, -0.37f, 0.52f, -0.57f, 0.77f)
                lineTo(88.0f, 129.45f)
                curveToRelative(7.49f, 15.22f, 23.41f, 31.0f, 38.83f, 38.51f)
                lineToRelative(24.34f, -20.71f)
                arcToRelative(8.12f, 8.12f, 0.0f, false, true, 0.75f, -0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.17f, -1.4f)
                lineToRelative(0.13f, 0.06f)
                lineToRelative(47.11f, 21.11f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 223.88f, 183.08f)
                close()
                moveTo(208.0f, 181.08f)
                reflectiveCurveToRelative(-0.07f, 0.0f, -0.11f, 0.0f)
                horizontalLineToRelative(0.0f)
                lineToRelative(-47.0f, -21.05f)
                lineToRelative(-24.35f, 20.71f)
                arcToRelative(8.44f, 8.44f, 0.0f, false, true, -0.74f, 0.56f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.75f, 1.14f)
                curveToRelative(-18.73f, -9.05f, -37.4f, -27.58f, -46.46f, -46.11f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 1.0f, -15.7f)
                arcToRelative(6.13f, 6.13f, 0.0f, false, true, 0.57f, -0.77f)
                lineTo(96.0f, 95.15f)
                lineToRelative(-21.0f, -47.0f)
                arcToRelative(0.61f, 0.61f, 0.0f, false, true, 0.0f, -0.12f)
                arcTo(40.2f, 40.2f, 0.0f, false, false, 40.0f, 88.0f)
                arcTo(128.14f, 128.14f, 0.0f, false, false, 168.0f, 216.0f)
                arcTo(40.21f, 40.21f, 0.0f, false, false, 208.0f, 181.07f)
                close()
            }
        }
        .build()
        return `_phone-x`!!
    }

private var `_phone-x`: ImageVector? = null
