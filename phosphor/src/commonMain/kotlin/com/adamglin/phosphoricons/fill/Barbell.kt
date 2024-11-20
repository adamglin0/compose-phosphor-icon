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

public val FillGroup.Barbell: ImageVector
    get() {
        if (_barbell != null) {
            return _barbell!!
        }
        _barbell = Builder(name = "Barbell", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 64.0f)
                lineTo(200.0f, 192.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(168.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(152.0f, 136.0f)
                lineTo(104.0f, 136.0f)
                verticalLineToRelative(56.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(72.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                lineTo(56.0f, 64.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 72.0f, 48.0f)
                lineTo(88.0f, 48.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, 16.0f)
                verticalLineToRelative(56.0f)
                horizontalLineToRelative(48.0f)
                lineTo(152.0f, 64.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 16.0f, -16.0f)
                horizontalLineToRelative(16.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 200.0f, 64.0f)
                close()
                moveTo(36.0f, 72.0f)
                lineTo(32.0f, 72.0f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 16.0f, 88.0f)
                verticalLineToRelative(32.0f)
                lineTo(8.27f, 120.0f)
                arcTo(8.18f, 8.18f, 0.0f, false, false, 0.0f, 127.47f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 8.0f, 136.0f)
                horizontalLineToRelative(8.0f)
                verticalLineToRelative(32.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, 16.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                lineTo(40.0f, 76.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 36.0f, 72.0f)
                close()
                moveTo(256.0f, 127.47f)
                arcToRelative(8.18f, 8.18f, 0.0f, false, false, -8.25f, -7.47f)
                lineTo(240.0f, 120.0f)
                lineTo(240.0f, 88.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.0f, -16.0f)
                horizontalLineToRelative(-4.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -4.0f, 4.0f)
                lineTo(216.0f, 180.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, 4.0f)
                horizontalLineToRelative(4.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 16.0f, -16.0f)
                lineTo(240.0f, 136.0f)
                horizontalLineToRelative(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 256.0f, 127.47f)
                close()
            }
        }
        .build()
        return _barbell!!
    }

private var _barbell: ImageVector? = null
