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

public val BoldGroup.Crane: ImageVector
    get() {
        if (_crane != null) {
            return _crane!!
        }
        _crane = Builder(name = "Crane", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(230.17f, 13.71f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -11.82f, -0.3f)
                lineTo(101.0f, 76.0f)
                horizontalLineTo(32.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 12.0f, 96.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(88.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(168.0f)
                arcToRelative(11.86f, 11.86f, 0.0f, false, false, -0.51f, -3.45f)
                lineTo(118.32f, 94.0f)
                lineTo(212.0f, 44.0f)
                verticalLineTo(156.0f)
                horizontalLineTo(200.0f)
                verticalLineToRelative(-4.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineToRelative(8.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineToRelative(20.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(24.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 230.17f, 13.71f)
                close()
                moveTo(95.07f, 100.0f)
                lineToRelative(16.8f, 56.0f)
                horizontalLineTo(76.0f)
                verticalLineTo(100.0f)
                close()
                moveTo(52.0f, 100.0f)
                verticalLineToRelative(56.0f)
                horizontalLineTo(36.0f)
                verticalLineTo(100.0f)
                close()
                moveTo(36.0f, 196.0f)
                verticalLineTo(180.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(16.0f)
                close()
            }
        }
        .build()
        return _crane!!
    }

private var _crane: ImageVector? = null
