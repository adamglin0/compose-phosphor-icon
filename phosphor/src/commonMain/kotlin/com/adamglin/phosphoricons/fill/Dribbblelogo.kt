package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.DribbbleLogo: ImageVector
    get() {
        if (_dribbbleLogo != null) {
            return _dribbbleLogo!!
        }
        _dribbbleLogo = Builder(name = "DribbbleLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(93.27f, 36.86f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 0.82f, -7.19f)
                arcToRelative(103.94f, 103.94f, 0.0f, false, true, 88.66f, 9.95f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 1.0f, 5.87f)
                arcToRelative(153.32f, 153.32f, 0.0f, false, true, -41.89f, 37.0f)
                arcTo(169.43f, 169.43f, 0.0f, false, false, 93.27f, 36.86f)
                close()
                moveTo(127.58f, 90.0f)
                arcToRelative(153.0f, 153.0f, 0.0f, false, false, -56.0f, -46.91f)
                arcToRelative(3.94f, 3.94f, 0.0f, false, false, -4.0f, 0.33f)
                arcToRelative(104.41f, 104.41f, 0.0f, false, false, -38.34f, 52.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.0f, 5.16f)
                arcTo(152.34f, 152.34f, 0.0f, false, false, 64.0f, 104.0f)
                arcTo(151.0f, 151.0f, 0.0f, false, false, 127.58f, 90.0f)
                close()
                moveTo(231.38f, 116.69f)
                arcTo(103.81f, 103.81f, 0.0f, false, false, 202.19f, 55.2f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -6.0f, 0.34f)
                arcToRelative(169.15f, 169.15f, 0.0f, false, true, -45.69f, 40.4f)
                arcToRelative(167.73f, 167.73f, 0.0f, false, true, 13.55f, 29.9f)
                arcTo(167.64f, 167.64f, 0.0f, false, true, 208.0f, 120.0f)
                arcTo(169.35f, 169.35f, 0.0f, false, true, 227.0f, 121.07f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 231.38f, 116.72f)
                close()
                moveTo(168.47f, 141.19f)
                arcToRelative(167.7f, 167.7f, 0.0f, false, true, 4.45f, 38.47f)
                arcToRelative(168.0f, 168.0f, 0.0f, false, true, -4.11f, 36.85f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 174.5f, 221.0f)
                arcToRelative(104.25f, 104.25f, 0.0f, false, false, 56.57f, -79.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -3.49f, -4.49f)
                arcToRelative(152.44f, 152.44f, 0.0f, false, false, -59.11f, 4.0f)
                close()
                moveTo(148.83f, 130.74f)
                arcToRelative(151.76f, 151.76f, 0.0f, false, false, -12.39f, -27.21f)
                arcTo(167.0f, 167.0f, 0.0f, false, true, 64.0f, 120.0f)
                arcToRelative(168.4f, 168.4f, 0.0f, false, true, -34.88f, -3.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.81f, 3.56f)
                quadToRelative(-0.31f, 4.0f, -0.32f, 8.09f)
                arcToRelative(103.72f, 103.72f, 0.0f, false, false, 33.0f, 75.91f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 6.15f, -0.92f)
                arcTo(169.0f, 169.0f, 0.0f, false, true, 148.83f, 130.77f)
                close()
                moveTo(75.69f, 213.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.52f, 5.48f)
                arcToRelative(103.88f, 103.88f, 0.0f, false, false, 68.85f, 11.69f)
                arcToRelative(3.93f, 3.93f, 0.0f, false, false, 3.06f, -2.65f)
                arcToRelative(152.6f, 152.6f, 0.0f, false, false, 7.8f, -48.08f)
                arcToRelative(151.3f, 151.3f, 0.0f, false, false, -3.74f, -33.46f)
                arcTo(152.94f, 152.94f, 0.0f, false, false, 75.69f, 213.25f)
                close()
            }
        }
        .build()
        return _dribbbleLogo!!
    }

private var _dribbbleLogo: ImageVector? = null
