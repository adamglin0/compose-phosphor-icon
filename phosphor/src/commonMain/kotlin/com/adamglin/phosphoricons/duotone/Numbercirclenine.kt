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

public val DuotoneGroup.NumberCircleNine: ImageVector
    get() {
        if (_numberCircleNine != null) {
            return _numberCircleNine!!
        }
        _numberCircleNine = Builder(name = "NumberCircleNine", defaultWidth = 24.0.dp, defaultHeight
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
                moveTo(146.0f, 76.82f)
                arcTo(36.0f, 36.0f, 0.0f, true, false, 127.94f, 144.0f)
                quadToRelative(0.94f, 0.0f, 1.89f, -0.06f)
                lineToRelative(-16.7f, 28.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 2.77f, 11.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.0f, -2.77f)
                lineTo(159.18f, 126.0f)
                arcTo(36.05f, 36.05f, 0.0f, false, false, 146.0f, 76.82f)
                close()
                moveTo(145.33f, 118.0f)
                lineToRelative(0.0f, 0.0f)
                arcTo(20.0f, 20.0f, 0.0f, true, true, 138.0f, 90.68f)
                arcTo(20.0f, 20.0f, 0.0f, false, true, 145.31f, 118.0f)
                close()
            }
        }
        .build()
        return _numberCircleNine!!
    }

private var _numberCircleNine: ImageVector? = null
