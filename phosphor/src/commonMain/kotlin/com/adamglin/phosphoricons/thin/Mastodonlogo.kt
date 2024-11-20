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

public val ThinGroup.MastodonLogo: ImageVector
    get() {
        if (_mastodonLogo != null) {
            return _mastodonLogo!!
        }
        _mastodonLogo = Builder(name = "MastodonLogo", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 36.0f)
                lineTo(72.0f, 36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 36.0f, 72.0f)
                lineTo(36.0f, 192.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, 36.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -8.0f)
                lineTo(72.0f, 220.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, -28.0f)
                lineTo(44.0f, 180.0f)
                lineTo(184.0f, 180.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 36.0f, -36.0f)
                lineTo(220.0f, 72.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 184.0f, 36.0f)
                close()
                moveTo(212.0f, 144.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                lineTo(44.0f, 172.0f)
                lineTo(44.0f, 72.0f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 72.0f, 44.0f)
                lineTo(184.0f, 44.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 28.0f, 28.0f)
                close()
                moveTo(180.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(172.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(124.0f, 104.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -40.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -8.0f, 0.0f)
                lineTo(76.0f, 104.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 52.0f, -14.41f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 180.0f, 104.0f)
                close()
            }
        }
        .build()
        return _mastodonLogo!!
    }

private var _mastodonLogo: ImageVector? = null
