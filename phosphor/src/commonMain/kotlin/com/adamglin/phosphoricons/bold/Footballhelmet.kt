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

public val BoldGroup.Footballhelmet: ImageVector
    get() {
        if (_footballhelmet != null) {
            return _footballhelmet!!
        }
        _footballhelmet = Builder(name = "Footballhelmet", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(216.0f, 156.0f)
                horizontalLineTo(168.79f)
                lineToRelative(-4.73f, -16.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineToRelative(-4.0f)
                arcTo(104.0f, 104.0f, 0.0f, false, false, 122.52f, 20.0f)
                curveTo(66.0f, 20.8f, 20.0f, 67.43f, 20.0f, 124.0f)
                arcToRelative(104.0f, 104.0f, 0.0f, false, false, 45.37f, 85.94f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 72.14f, 212.0f)
                horizontalLineTo(116.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 19.52f, -24.34f)
                quadToRelative(-0.09f, -0.41f, -0.21f, -0.81f)
                lineToRelative(-2.0f, -6.85f)
                horizontalLineToRelative(17.58f)
                lineToRelative(10.0f, 33.67f)
                arcTo(20.11f, 20.11f, 0.0f, false, false, 180.0f, 228.0f)
                horizontalLineToRelative(36.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(176.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 216.0f, 156.0f)
                close()
                moveTo(100.4f, 123.48f)
                arcToRelative(19.94f, 19.94f, 0.0f, false, false, -3.92f, 16.86f)
                quadToRelative(0.09f, 0.41f, 0.21f, 0.81f)
                lineTo(110.61f, 188.0f)
                horizontalLineTo(76.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, -32.0f, -64.0f)
                curveToRelative(0.0f, -43.48f, 35.39f, -79.36f, 78.86f, -80.0f)
                horizontalLineTo(124.0f)
                arcToRelative(80.0f, 80.0f, 0.0f, false, true, 79.61f, 72.0f)
                horizontalLineTo(116.0f)
                arcTo(19.94f, 19.94f, 0.0f, false, false, 100.4f, 123.48f)
                close()
                moveTo(126.14f, 156.0f)
                lineToRelative(-4.75f, -16.0f)
                horizontalLineTo(139.0f)
                lineToRelative(4.73f, 16.0f)
                close()
                moveTo(212.0f, 204.0f)
                horizontalLineTo(183.0f)
                lineToRelative(-7.09f, -24.0f)
                horizontalLineTo(212.0f)
                close()
            }
        }
        .build()
        return _footballhelmet!!
    }

private var _footballhelmet: ImageVector? = null
