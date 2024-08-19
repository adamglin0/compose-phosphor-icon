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

public val RegularGroup.`Moped-front`: ImageVector
    get() {
        if (`_moped-front` != null) {
            return `_moped-front`!!
        }
        `_moped-front` = Builder(name = "Moped-front", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 40.0f)
                lineTo(167.2f, 40.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, -78.4f, 0.0f)
                lineTo(48.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                lineTo(88.8f, 56.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, false, 12.58f, 21.82f)
                arcTo(64.08f, 64.08f, 0.0f, false, false, 64.0f, 136.0f)
                verticalLineToRelative(64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                lineTo(96.0f, 216.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, 64.0f, 0.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(192.0f, 136.0f)
                arcToRelative(64.08f, 64.08f, 0.0f, false, false, -37.38f, -58.18f)
                arcTo(40.0f, 40.0f, 0.0f, false, false, 167.2f, 56.0f)
                lineTo(208.0f, 56.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(144.0f, 216.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -32.0f, 0.0f)
                lineTo(112.0f, 168.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                close()
                moveTo(176.0f, 136.0f)
                verticalLineToRelative(64.0f)
                lineTo(160.0f, 200.0f)
                lineTo(160.0f, 168.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, false, -64.0f, 0.0f)
                verticalLineToRelative(32.0f)
                lineTo(80.0f, 200.0f)
                lineTo(80.0f, 136.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 96.0f, 0.0f)
                close()
                moveTo(104.0f, 48.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 104.0f, 48.0f)
                close()
            }
        }
        .build()
        return `_moped-front`!!
    }

private var `_moped-front`: ImageVector? = null
