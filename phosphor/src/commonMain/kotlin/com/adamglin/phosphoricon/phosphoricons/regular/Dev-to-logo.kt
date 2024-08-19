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

public val RegularGroup.`Dev-to-logo`: ImageVector
    get() {
        if (`_dev-to-logo` != null) {
            return `_dev-to-logo`!!
        }
        `_dev-to-logo` = Builder(name = "Dev-to-logo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 56.0f)
                lineTo(24.0f, 56.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 8.0f, 72.0f)
                lineTo(8.0f, 184.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(232.0f, 200.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(248.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 232.0f, 56.0f)
                close()
                moveTo(232.0f, 184.0f)
                lineTo(24.0f, 184.0f)
                lineTo(24.0f, 72.0f)
                lineTo(232.0f, 72.0f)
                lineTo(232.0f, 184.0f)
                close()
                moveTo(128.0f, 104.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                horizontalLineToRelative(-8.0f)
                verticalLineToRelative(16.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                lineTo(120.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, -8.0f)
                lineTo(112.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, -8.0f)
                horizontalLineToRelative(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
                moveTo(215.7f, 98.17f)
                lineTo(197.7f, 162.17f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -15.4f, 0.0f)
                lineToRelative(-18.0f, -64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 15.4f, -4.34f)
                lineTo(190.0f, 130.45f)
                lineToRelative(10.3f, -36.62f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 15.4f, 4.34f)
                close()
                moveTo(64.0f, 88.0f)
                lineTo(56.0f, 88.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -8.0f, 8.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(8.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 32.0f, -32.0f)
                lineTo(96.0f, 120.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, false, 64.0f, 88.0f)
                close()
                moveTo(80.0f, 136.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(64.0f, 104.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                close()
            }
        }
        .build()
        return `_dev-to-logo`!!
    }

private var `_dev-to-logo`: ImageVector? = null
