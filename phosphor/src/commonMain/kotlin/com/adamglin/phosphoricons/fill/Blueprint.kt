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

public val FillGroup.Blueprint: ImageVector
    get() {
        if (_blueprint != null) {
            return _blueprint!!
        }
        _blueprint = Builder(name = "Blueprint", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(136.0f, 120.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(16.0f)
                lineTo(136.0f, 136.0f)
                close()
                moveTo(240.0f, 64.0f)
                lineTo(240.0f, 200.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(48.0f, 208.0f)
                arcToRelative(32.0f, 32.0f, 0.0f, false, true, -32.0f, -32.0f)
                lineTo(16.0f, 64.0f)
                arcTo(32.0f, 32.0f, 0.0f, false, true, 48.0f, 32.0f)
                lineTo(64.0f, 32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 8.0f, 8.0f)
                lineTo(72.0f, 56.0f)
                lineTo(232.0f, 56.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 240.0f, 64.0f)
                close()
                moveTo(56.0f, 48.0f)
                lineTo(48.0f, 48.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 32.0f, 64.0f)
                verticalLineToRelative(84.29f)
                arcTo(31.82f, 31.82f, 0.0f, false, true, 48.0f, 144.0f)
                horizontalLineToRelative(8.0f)
                close()
                moveTo(176.0f, 136.0f)
                lineTo(176.0f, 120.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                lineTo(176.0f, 104.0f)
                lineTo(176.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(136.0f, 104.0f)
                lineTo(136.0f, 96.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -16.0f, 0.0f)
                verticalLineToRelative(8.0f)
                lineTo(104.0f, 104.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(16.0f)
                lineTo(104.0f, 136.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineToRelative(16.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(24.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                verticalLineToRelative(-8.0f)
                horizontalLineToRelative(16.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
            }
        }
        .build()
        return _blueprint!!
    }

private var _blueprint: ImageVector? = null
