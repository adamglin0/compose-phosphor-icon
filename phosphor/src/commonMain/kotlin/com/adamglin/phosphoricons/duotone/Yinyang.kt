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

public val DuotoneGroup.YinYang: ImageVector
    get() {
        if (_yinYang != null) {
            return _yinYang!!
        }
        _yinYang = Builder(name = "YinYang", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 128.0f)
                arcToRelative(96.0f, 96.0f, 0.0f, false, true, -96.0f, 96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, true, 0.0f, -96.0f)
                arcToRelative(48.0f, 48.0f, 0.0f, false, false, 0.0f, -96.0f)
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
                moveTo(40.0f, 128.0f)
                arcToRelative(88.1f, 88.1f, 0.0f, false, true, 88.0f, -88.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, 80.0f)
                arcTo(56.0f, 56.0f, 0.0f, false, false, 77.39f, 200.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 40.0f, 128.0f)
                close()
                moveTo(128.0f, 216.0f)
                arcToRelative(40.0f, 40.0f, 0.0f, false, true, 0.0f, -80.0f)
                arcToRelative(56.0f, 56.0f, 0.0f, false, false, 50.61f, -79.95f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 128.0f, 216.0f)
                close()
                moveTo(140.0f, 176.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 140.0f, 176.0f)
                close()
                moveTo(116.0f, 80.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 116.0f, 80.0f)
                close()
            }
        }
        .build()
        return _yinYang!!
    }

private var _yinYang: ImageVector? = null
