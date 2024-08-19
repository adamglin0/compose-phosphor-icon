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

public val BoldGroup.Armchair: ImageVector
    get() {
        if (_armchair != null) {
            return _armchair!!
        }
        _armchair = Builder(name = "Armchair", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(220.0f, 78.53f)
                verticalLineTo(72.0f)
                arcToRelative(44.05f, 44.05f, 0.0f, false, false, -44.0f, -44.0f)
                horizontalLineTo(80.0f)
                arcTo(44.05f, 44.05f, 0.0f, false, false, 36.0f, 72.0f)
                verticalLineToRelative(6.53f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, 99.0f)
                verticalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(200.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(177.51f)
                arcToRelative(52.0f, 52.0f, 0.0f, false, false, 0.0f, -99.0f)
                close()
                moveTo(80.0f, 52.0f)
                horizontalLineToRelative(96.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, 20.0f, 20.0f)
                verticalLineToRelative(4.62f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 152.17f, 124.0f)
                horizontalLineTo(103.83f)
                arcTo(52.09f, 52.09f, 0.0f, false, false, 60.0f, 76.62f)
                verticalLineTo(72.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 80.0f, 52.0f)
                close()
                moveTo(206.81f, 155.86f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 196.0f, 167.8f)
                verticalLineTo(196.0f)
                horizontalLineTo(60.0f)
                verticalLineTo(167.8f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, -10.81f, -11.94f)
                arcTo(28.0f, 28.0f, 0.0f, true, true, 80.0f, 128.0f)
                verticalLineToRelative(36.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(148.0f)
                horizontalLineToRelative(48.0f)
                verticalLineToRelative(16.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 24.0f, 0.0f)
                verticalLineTo(128.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, true, true, 30.81f, 27.86f)
                close()
            }
        }
        .build()
        return _armchair!!
    }

private var _armchair: ImageVector? = null
