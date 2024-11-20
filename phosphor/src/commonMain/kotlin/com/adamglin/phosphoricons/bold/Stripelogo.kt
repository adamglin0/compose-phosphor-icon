package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.StripeLogo: ImageVector
    get() {
        if (_stripeLogo != null) {
            return _stripeLogo!!
        }
        _stripeLogo = Builder(name = "StripeLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 28.0f)
                lineTo(48.0f, 28.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 28.0f, 48.0f)
                lineTo(28.0f, 208.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                lineTo(208.0f, 228.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                lineTo(228.0f, 48.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 208.0f, 28.0f)
                close()
                moveTo(204.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 52.0f)
                lineTo(204.0f, 52.0f)
                close()
                moveTo(148.0f, 152.0f)
                curveToRelative(0.0f, -6.37f, -6.29f, -9.32f, -24.0f, -14.42f)
                curveToRelative(-16.14f, -4.65f, -38.23f, -11.0f, -38.23f, -33.58f)
                curveToRelative(0.0f, -20.52f, 18.15f, -36.0f, 42.22f, -36.0f)
                curveToRelative(17.24f, 0.0f, 32.06f, 8.14f, 38.69f, 21.24f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -21.41f, 10.84f)
                curveTo(142.8f, 95.17f, 136.0f, 92.0f, 128.0f, 92.0f)
                curveToRelative(-10.22f, 0.0f, -18.22f, 5.27f, -18.22f, 12.0f)
                curveToRelative(0.0f, 1.09f, 0.0f, 2.21f, 3.28f, 4.17f)
                curveToRelative(4.18f, 2.48f, 11.0f, 4.45f, 17.6f, 6.35f)
                curveToRelative(8.75f, 2.52f, 17.8f, 5.13f, 25.38f, 9.86f)
                curveToRelative(13.19f, 8.23f, 16.0f, 19.56f, 16.0f, 27.62f)
                curveToRelative(0.0f, 20.19f, -19.33f, 36.0f, -44.0f, 36.0f)
                curveToRelative(-21.26f, 0.0f, -39.46f, -12.35f, -43.27f, -29.38f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 23.42f, -5.24f)
                curveTo(109.3f, 158.49f, 117.21f, 164.0f, 128.0f, 164.0f)
                curveTo(137.44f, 164.0f, 148.0f, 158.87f, 148.0f, 152.0f)
                close()
            }
        }
        .build()
        return _stripeLogo!!
    }

private var _stripeLogo: ImageVector? = null
