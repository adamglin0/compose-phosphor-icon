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

public val ThinGroup.`Tote-thin`: ImageVector
    get() {
        if (`_tote-thin` != null) {
            return `_tote-thin`!!
        }
        `_tote-thin` = Builder(name = "Tote-thin", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(233.0f, 72.06f)
                arcTo(12.11f, 12.11f, 0.0f, false, false, 223.92f, 68.0f)
                horizontalLineTo(172.0f)
                verticalLineTo(64.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -88.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(32.08f)
                arcTo(12.11f, 12.11f, 0.0f, false, false, 23.0f, 72.06f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -2.94f, 9.35f)
                lineToRelative(14.26f, 120.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 10.59f)
                horizontalLineTo(209.67f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -10.59f)
                lineToRelative(14.26f, -120.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 233.0f, 72.06f)
                close()
                moveTo(92.0f, 64.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 72.0f, 0.0f)
                verticalLineToRelative(4.0f)
                horizontalLineTo(92.0f)
                close()
                moveTo(228.0f, 80.46f)
                lineToRelative(-14.25f, 120.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.05f, 3.54f)
                horizontalLineTo(46.33f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -3.54f)
                lineTo(28.0f, 80.46f)
                arcToRelative(3.9f, 3.9f, 0.0f, false, true, 1.0f, -3.09f)
                arcTo(4.08f, 4.08f, 0.0f, false, true, 32.08f, 76.0f)
                horizontalLineTo(84.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(72.0f)
                verticalLineToRelative(28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 8.0f, 0.0f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(51.92f)
                arcTo(4.08f, 4.08f, 0.0f, false, true, 227.0f, 77.37f)
                arcTo(3.9f, 3.9f, 0.0f, false, true, 228.0f, 80.46f)
                close()
            }
        }
        .build()
        return `_tote-thin`!!
    }

private var `_tote-thin`: ImageVector? = null
