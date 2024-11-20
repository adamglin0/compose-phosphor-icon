package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.ApplePodcastsLogo: ImageVector
    get() {
        if (_applePodcastsLogo != null) {
            return _applePodcastsLogo!!
        }
        _applePodcastsLogo = Builder(name = "ApplePodcastsLogo", defaultWidth = 24.0.dp,
                defaultHeight = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(151.0f, 139.2f)
                arcToRelative(30.0f, 30.0f, 0.0f, true, false, -46.06f, 0.0f)
                arcToRelative(22.14f, 22.14f, 0.0f, false, false, -10.35f, 7.39f)
                arcToRelative(21.68f, 21.68f, 0.0f, false, false, -3.94f, 18.77f)
                lineToRelative(12.18f, 48.0f)
                arcTo(22.17f, 22.17f, 0.0f, false, false, 124.44f, 230.0f)
                horizontalLineToRelative(7.12f)
                arcToRelative(22.17f, 22.17f, 0.0f, false, false, 21.58f, -16.64f)
                lineToRelative(12.18f, -48.0f)
                arcToRelative(21.68f, 21.68f, 0.0f, false, false, -3.94f, -18.77f)
                arcTo(22.14f, 22.14f, 0.0f, false, false, 151.0f, 139.2f)
                close()
                moveTo(128.0f, 102.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, true, true, -18.0f, 18.0f)
                arcTo(18.0f, 18.0f, 0.0f, false, true, 128.0f, 102.0f)
                close()
                moveTo(153.69f, 162.4f)
                lineTo(141.51f, 210.4f)
                arcToRelative(10.19f, 10.19f, 0.0f, false, true, -9.95f, 7.6f)
                horizontalLineToRelative(-7.12f)
                arcToRelative(10.19f, 10.19f, 0.0f, false, true, -10.0f, -7.6f)
                lineToRelative(-12.18f, -48.0f)
                arcToRelative(9.75f, 9.75f, 0.0f, false, true, 1.78f, -8.44f)
                arcToRelative(10.25f, 10.25f, 0.0f, false, true, 8.16f, -4.0f)
                horizontalLineToRelative(31.5f)
                arcToRelative(10.25f, 10.25f, 0.0f, false, true, 8.16f, 4.0f)
                arcTo(9.75f, 9.75f, 0.0f, false, true, 153.69f, 162.4f)
                close()
                moveTo(186.0f, 128.0f)
                arcTo(58.0f, 58.0f, 0.0f, true, false, 72.11f, 143.58f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.56f, 3.21f)
                arcToRelative(70.0f, 70.0f, 0.0f, true, true, 134.9f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -11.56f, -3.21f)
                arcTo(58.31f, 58.31f, 0.0f, false, false, 186.0f, 128.0f)
                close()
                moveTo(230.0f, 128.0f)
                arcToRelative(101.91f, 101.91f, 0.0f, false, true, -45.29f, 84.79f)
                arcToRelative(6.0f, 6.0f, 0.0f, true, true, -6.68f, -10.0f)
                arcToRelative(90.0f, 90.0f, 0.0f, true, false, -100.06f, 0.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.68f, 10.0f)
                arcTo(102.0f, 102.0f, 0.0f, true, true, 230.0f, 128.0f)
                close()
            }
        }
        .build()
        return _applePodcastsLogo!!
    }

private var _applePodcastsLogo: ImageVector? = null
