package com.adamglin.phosphoricon.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.LightGroup

public val LightGroup.`Mastodon-logo-light`: ImageVector
    get() {
        if (`_mastodon-logo-light` != null) {
            return `_mastodon-logo-light`!!
        }
        `_mastodon-logo-light` = Builder(name = "Mastodon-logo-light", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 34.0f)
                lineTo(72.0f, 34.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 34.0f, 72.0f)
                lineTo(34.0f, 192.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, 38.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, -12.0f)
                lineTo(72.0f, 218.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, -26.0f)
                lineTo(46.0f, 182.0f)
                lineTo(184.0f, 182.0f)
                arcToRelative(38.0f, 38.0f, 0.0f, false, false, 38.0f, -38.0f)
                lineTo(222.0f, 72.0f)
                arcTo(38.0f, 38.0f, 0.0f, false, false, 184.0f, 34.0f)
                close()
                moveTo(210.0f, 144.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, -26.0f, 26.0f)
                lineTo(46.0f, 170.0f)
                lineTo(46.0f, 72.0f)
                arcTo(26.0f, 26.0f, 0.0f, false, true, 72.0f, 46.0f)
                lineTo(184.0f, 46.0f)
                arcToRelative(26.0f, 26.0f, 0.0f, false, true, 26.0f, 26.0f)
                close()
                moveTo(182.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(170.0f, 104.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(122.0f, 104.0f)
                arcToRelative(18.0f, 18.0f, 0.0f, false, false, -36.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                lineTo(74.0f, 104.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 54.0f, -18.0f)
                arcToRelative(30.0f, 30.0f, 0.0f, false, true, 54.0f, 18.0f)
                close()
            }
        }
        .build()
        return `_mastodon-logo-light`!!
    }

private var `_mastodon-logo-light`: ImageVector? = null
