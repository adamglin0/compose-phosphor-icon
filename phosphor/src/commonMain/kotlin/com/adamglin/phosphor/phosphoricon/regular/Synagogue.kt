package com.adamglin.phosphor.phosphoricon.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphor.phosphoricon.RegularGroup

public val RegularGroup.Synagogue: ImageVector
    get() {
        if (_synagogue != null) {
            return _synagogue!!
        }
        _synagogue = Builder(name = "Synagogue", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(208.0f, 57.38f)
                lineTo(208.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(192.0f, 57.38f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 176.0f, 80.0f)
                verticalLineToRelative(42.21f)
                lineTo(136.0f, 99.36f)
                lineTo(136.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(120.0f, 99.36f)
                lineTo(80.0f, 122.21f)
                lineTo(80.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 64.0f, 57.38f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                lineTo(48.0f, 57.38f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 32.0f, 80.0f)
                lineTo(32.0f, 216.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(120.0f, 176.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 16.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 57.38f)
                close()
                moveTo(200.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                lineTo(192.0f, 104.0f)
                lineTo(192.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 200.0f, 72.0f)
                close()
                moveTo(56.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                verticalLineToRelative(24.0f)
                lineTo(48.0f, 104.0f)
                lineTo(48.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 56.0f, 72.0f)
                close()
                moveTo(48.0f, 120.0f)
                lineTo(64.0f, 120.0f)
                verticalLineToRelative(88.0f)
                lineTo(48.0f, 208.0f)
                close()
                moveTo(128.0f, 152.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, false, false, -24.0f, 24.0f)
                verticalLineToRelative(32.0f)
                lineTo(80.0f, 208.0f)
                lineTo(80.0f, 140.64f)
                lineToRelative(48.0f, -27.43f)
                lineToRelative(48.0f, 27.43f)
                lineTo(176.0f, 208.0f)
                lineTo(152.0f, 208.0f)
                lineTo(152.0f, 176.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 128.0f, 152.0f)
                close()
                moveTo(192.0f, 208.0f)
                lineTo(192.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(88.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
