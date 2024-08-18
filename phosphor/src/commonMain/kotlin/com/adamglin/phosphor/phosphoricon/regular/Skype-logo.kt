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

public val RegularGroup.`Skype-logo`: ImageVector
    get() {
        if (`_skype-logo` != null) {
            return `_skype-logo`!!
        }
        `_skype-logo` = Builder(name = "Skype-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(168.0f, 152.0f)
                curveToRelative(0.0f, 17.64f, -17.94f, 32.0f, -40.0f, 32.0f)
                reflectiveCurveToRelative(-40.0f, -14.36f, -40.0f, -32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                curveToRelative(0.0f, 8.67f, 11.0f, 16.0f, 24.0f, 16.0f)
                reflectiveCurveToRelative(24.0f, -7.33f, 24.0f, -16.0f)
                curveToRelative(0.0f, -9.48f, -8.61f, -13.0f, -26.88f, -18.26f)
                curveTo(109.37f, 129.2f, 89.78f, 123.55f, 89.78f, 104.0f)
                curveToRelative(0.0f, -18.24f, 16.43f, -32.0f, 38.22f, -32.0f)
                curveToRelative(15.72f, 0.0f, 29.18f, 7.3f, 35.12f, 19.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.27f, 7.22f)
                curveTo(145.64f, 91.94f, 137.65f, 88.0f, 128.0f, 88.0f)
                curveToRelative(-12.67f, 0.0f, -22.22f, 6.88f, -22.22f, 16.0f)
                curveToRelative(0.0f, 7.0f, 9.0f, 10.1f, 23.77f, 14.36f)
                curveTo(145.78f, 123.0f, 168.0f, 129.45f, 168.0f, 152.0f)
                close()
                moveTo(232.0f, 176.0f)
                arcToRelative(56.06f, 56.06f, 0.0f, false, true, -56.0f, 56.0f)
                arcToRelative(55.38f, 55.38f, 0.0f, false, true, -31.17f, -9.47f)
                arcTo(96.09f, 96.09f, 0.0f, false, true, 33.47f, 111.17f)
                arcTo(55.38f, 55.38f, 0.0f, false, true, 24.0f, 80.0f)
                arcTo(56.06f, 56.06f, 0.0f, false, true, 80.0f, 24.0f)
                arcToRelative(55.38f, 55.38f, 0.0f, false, true, 31.17f, 9.47f)
                arcTo(96.09f, 96.09f, 0.0f, false, true, 222.53f, 144.83f)
                arcTo(55.38f, 55.38f, 0.0f, false, true, 232.0f, 176.0f)
                close()
                moveTo(216.0f, 176.0f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, false, -8.32f, -24.42f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -1.49f, -6.58f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 111.0f, 49.81f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -6.58f, -1.49f)
                arcTo(39.6f, 39.6f, 0.0f, false, false, 80.0f, 40.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 40.0f, 80.0f)
                arcToRelative(39.6f, 39.6f, 0.0f, false, false, 8.32f, 24.42f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 49.81f, 111.0f)
                arcTo(80.07f, 80.07f, 0.0f, false, false, 145.0f, 206.19f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 6.58f, 1.49f)
                arcTo(39.6f, 39.6f, 0.0f, false, false, 176.0f, 216.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 216.0f, 176.0f)
                close()
            }
        }
        .build()
        return `_skype-logo`!!
    }

private var `_skype-logo`: ImageVector? = null
