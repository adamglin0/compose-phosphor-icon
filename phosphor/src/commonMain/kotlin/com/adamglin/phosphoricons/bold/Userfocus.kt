package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.Userfocus: ImageVector
    get() {
        if (_userfocus != null) {
            return _userfocus!!
        }
        _userfocus = Builder(name = "Userfocus", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(228.0f, 40.0f)
                lineTo(228.0f, 76.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -24.0f, 0.0f)
                lineTo(204.0f, 52.0f)
                lineTo(180.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, -24.0f)
                horizontalLineToRelative(36.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 228.0f, 40.0f)
                close()
                moveTo(216.0f, 168.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(24.0f)
                lineTo(180.0f, 204.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                lineTo(228.0f, 180.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 216.0f, 168.0f)
                close()
                moveTo(76.0f, 204.0f)
                lineTo(52.0f, 204.0f)
                lineTo(52.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                lineTo(76.0f, 228.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                close()
                moveTo(40.0f, 88.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 52.0f, 76.0f)
                lineTo(52.0f, 52.0f)
                lineTo(76.0f, 52.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, -24.0f)
                lineTo(40.0f, 28.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 28.0f, 40.0f)
                lineTo(28.0f, 76.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 40.0f, 88.0f)
                close()
                moveTo(176.0f, 180.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -9.6f, -4.79f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, -76.82f, 0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -19.18f, -14.42f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 23.92f, -20.5f)
                arcToRelative(44.0f, 44.0f, 0.0f, true, true, 67.34f, 0.0f)
                arcToRelative(72.1f, 72.1f, 0.0f, false, true, 23.92f, 20.5f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 176.0f, 180.0f)
                close()
                moveTo(128.0f, 132.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, true, false, -20.0f, -20.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 128.0f, 132.0f)
                close()
            }
        }
        .build()
        return _userfocus!!
    }

private var _userfocus: ImageVector? = null
