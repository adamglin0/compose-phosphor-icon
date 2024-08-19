package com.adamglin.phosphoricons.fill

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.FillGroup

public val FillGroup.Synagogue: ImageVector
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
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(112.0f, 176.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 32.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, 8.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 8.0f, -8.0f)
                lineTo(224.0f, 80.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, false, 208.0f, 57.38f)
                close()
                moveTo(64.0f, 208.0f)
                lineTo(48.0f, 208.0f)
                lineTo(48.0f, 112.0f)
                lineTo(64.0f, 112.0f)
                close()
                moveTo(208.0f, 208.0f)
                lineTo(192.0f, 208.0f)
                lineTo(192.0f, 112.0f)
                horizontalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _synagogue!!
    }

private var _synagogue: ImageVector? = null
