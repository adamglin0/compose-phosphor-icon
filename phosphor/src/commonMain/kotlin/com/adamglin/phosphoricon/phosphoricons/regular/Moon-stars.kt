package com.adamglin.phosphoricon.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricon.phosphoricons.RegularGroup

public val RegularGroup.`Moon-stars`: ImageVector
    get() {
        if (`_moon-stars` != null) {
            return `_moon-stars`!!
        }
        `_moon-stars` = Builder(name = "Moon-stars", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(240.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(216.0f, 104.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, 0.0f)
                lineTo(200.0f, 104.0f)
                lineTo(184.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                lineTo(200.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                lineTo(216.0f, 88.0f)
                horizontalLineToRelative(16.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 96.0f)
                close()
                moveTo(144.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(168.0f, 56.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                horizontalLineToRelative(-8.0f)
                lineTo(168.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                horizontalLineToRelative(-8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                close()
                moveTo(216.77f, 153.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 1.43f, 8.0f)
                arcTo(96.0f, 96.0f, 0.0f, true, true, 95.07f, 37.8f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 10.6f, 9.06f)
                arcTo(88.07f, 88.07f, 0.0f, false, false, 209.14f, 150.33f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 216.77f, 153.0f)
                close()
                moveTo(197.38f, 167.88f)
                curveToRelative(-1.79f, 0.09f, -3.59f, 0.14f, -5.38f, 0.14f)
                arcTo(104.11f, 104.11f, 0.0f, false, true, 88.0f, 64.0f)
                curveToRelative(0.0f, -1.79f, 0.0f, -3.59f, 0.14f, -5.38f)
                arcTo(80.0f, 80.0f, 0.0f, true, false, 197.38f, 167.86f)
                close()
            }
        }
        .build()
        return `_moon-stars`!!
    }

private var `_moon-stars`: ImageVector? = null
