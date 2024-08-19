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

public val ThinGroup.`Instagram-logo-thin`: ImageVector
    get() {
        if (`_instagram-logo-thin` != null) {
            return `_instagram-logo-thin`!!
        }
        `_instagram-logo-thin` = Builder(name = "Instagram-logo-thin", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 84.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, false, 44.0f, 44.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 128.0f, 84.0f)
                close()
                moveTo(128.0f, 164.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, true, true, 36.0f, -36.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, true, 128.0f, 164.0f)
                close()
                moveTo(176.0f, 28.0f)
                lineTo(80.0f, 28.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 28.0f, 80.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, 52.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, 52.0f, -52.0f)
                lineTo(228.0f, 80.0f)
                arcTo(52.06f, 52.06f, 0.0f, false, false, 176.0f, 28.0f)
                close()
                moveTo(220.0f, 176.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, 44.0f)
                lineTo(80.0f, 220.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, -44.0f, -44.0f)
                lineTo(36.0f, 80.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, true, 80.0f, 36.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, true, 44.0f, 44.0f)
                close()
                moveTo(188.0f, 76.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -8.0f, -8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 188.0f, 76.0f)
                close()
            }
        }
        .build()
        return `_instagram-logo-thin`!!
    }

private var `_instagram-logo-thin`: ImageVector? = null
