package com.adamglin.phosphoricon.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.BoldGroup

public val BoldGroup.`Mastodon-logo-bold`: ImageVector
    get() {
        if (`_mastodon-logo-bold` != null) {
            return `_mastodon-logo-bold`!!
        }
        `_mastodon-logo-bold` = Builder(name = "Mastodon-logo-bold", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(184.0f, 28.0f)
                lineTo(72.0f, 28.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 28.0f, 72.0f)
                lineTo(28.0f, 192.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, 44.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(72.0f, 212.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, -20.0f)
                verticalLineToRelative(-4.0f)
                lineTo(184.0f, 188.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, 44.0f, -44.0f)
                lineTo(228.0f, 72.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 184.0f, 28.0f)
                close()
                moveTo(204.0f, 144.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                lineTo(52.0f, 164.0f)
                lineTo(52.0f, 72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 72.0f, 52.0f)
                lineTo(184.0f, 52.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                close()
                moveTo(188.0f, 104.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(164.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(116.0f, 104.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(68.0f, 104.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 60.0f, -26.8f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 188.0f, 104.0f)
                close()
            }
        }
        .build()
        return `_mastodon-logo-bold`!!
    }

private var `_mastodon-logo-bold`: ImageVector? = null
