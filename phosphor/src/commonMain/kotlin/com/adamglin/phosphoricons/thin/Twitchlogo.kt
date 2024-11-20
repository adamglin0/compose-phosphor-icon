package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.TwitchLogo: ImageVector
    get() {
        if (_twitchLogo != null) {
            return _twitchLogo!!
        }
        _twitchLogo = Builder(name = "TwitchLogo", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 36.0f)
                lineTo(48.0f, 36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 36.0f, 48.0f)
                lineTo(36.0f, 192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(68.0f, 204.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.3f, 3.62f)
                arcTo(3.9f, 3.9f, 0.0f, false, false, 72.0f, 244.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 2.56f, -0.93f)
                lineTo(121.45f, 204.0f)
                lineTo(165.1f, 204.0f)
                arcToRelative(12.06f, 12.06f, 0.0f, false, false, 7.69f, -2.78f)
                lineToRelative(42.89f, -35.75f)
                arcToRelative(11.93f, 11.93f, 0.0f, false, false, 4.32f, -9.22f)
                lineTo(220.0f, 48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 208.0f, 36.0f)
                close()
                moveTo(212.0f, 156.25f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -1.44f, 3.08f)
                lineToRelative(-42.9f, 35.74f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -2.56f, 0.93f)
                lineTo(120.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.56f, 0.93f)
                lineTo(76.0f, 231.46f)
                lineTo(76.0f, 200.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, -4.0f)
                lineTo(48.0f, 196.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                lineTo(44.0f, 48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                lineTo(208.0f, 44.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, 4.0f)
                close()
                moveTo(172.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(164.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
                moveTo(124.0f, 88.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(116.0f, 88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 8.0f, 0.0f)
                close()
            }
        }
        .build()
        return _twitchLogo!!
    }

private var _twitchLogo: ImageVector? = null
