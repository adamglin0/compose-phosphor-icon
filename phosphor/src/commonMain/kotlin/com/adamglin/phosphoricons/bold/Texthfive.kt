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

public val BoldGroup.Texthfive: ImageVector
    get() {
        if (_texthfive != null) {
            return _texthfive!!
        }
        _texthfive = Builder(name = "Texthfive", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(252.0f, 180.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, -40.0f, 40.0f)
                arcToRelative(39.53f, 39.53f, 0.0f, false, true, -28.57f, -11.6f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 17.14f, -16.8f)
                arcTo(15.54f, 15.54f, 0.0f, false, false, 212.0f, 196.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 0.0f, -32.0f)
                arcToRelative(15.54f, 15.54f, 0.0f, false, false, -11.43f, 4.4f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 180.16f, 158.0f)
                lineToRelative(8.0f, -48.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 200.0f, 100.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, 0.0f, 24.0f)
                horizontalLineTo(210.17f)
                lineToRelative(-2.71f, 16.23f)
                arcTo(45.39f, 45.39f, 0.0f, false, true, 212.0f, 140.0f)
                arcTo(40.0f, 40.0f, 0.0f, false, true, 252.0f, 180.0f)
                close()
                moveTo(144.0f, 44.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -12.0f, 12.0f)
                verticalLineToRelative(48.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(56.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -24.0f, 0.0f)
                verticalLineTo(176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                horizontalLineToRelative(80.0f)
                verticalLineToRelative(48.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(56.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 144.0f, 44.0f)
                close()
            }
        }
        .build()
        return _texthfive!!
    }

private var _texthfive: ImageVector? = null
