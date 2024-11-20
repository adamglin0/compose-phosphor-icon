package com.adamglin.phosphoricons.duotone

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.DuotoneGroup

public val DuotoneGroup.NumberCircleFive: ImageVector
    get() {
        if (_numberCircleFive != null) {
            return _numberCircleFive!!
        }
        _numberCircleFive = Builder(name = "NumberCircleFive", defaultWidth = 24.0.dp, defaultHeight
                = 24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, true, true, -96.0f, -96.0f)
                arcTo(96.0f, 96.0f, 0.0f, false, true, 224.0f, 128.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(88.0f, 88.0f, 0.0f, true, true, 88.0f, -88.0f)
                arcTo(88.1f, 88.1f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(118.78f, 88.0f)
                lineToRelative(-4.19f, 25.14f)
                arcTo(38.8f, 38.8f, 0.0f, false, true, 124.0f, 112.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 0.0f, 72.0f)
                arcToRelative(35.54f, 35.54f, 0.0f, false, true, -25.71f, -10.4f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, 11.42f, -11.2f)
                arcTo(19.73f, 19.73f, 0.0f, false, false, 124.0f, 168.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 0.0f, -40.0f)
                arcToRelative(19.73f, 19.73f, 0.0f, false, false, -14.29f, 5.6f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -13.6f, -6.92f)
                lineToRelative(8.0f, -48.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 112.0f, 72.0f)
                horizontalLineToRelative(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, 16.0f)
                close()
            }
        }
        .build()
        return _numberCircleFive!!
    }

private var _numberCircleFive: ImageVector? = null
