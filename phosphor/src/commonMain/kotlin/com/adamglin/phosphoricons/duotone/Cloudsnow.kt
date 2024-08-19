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

public val DuotoneGroup.Cloudsnow: ImageVector
    get() {
        if (_cloudsnow != null) {
            return _cloudsnow!!
        }
        _cloudsnow = Builder(name = "Cloudsnow", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(224.0f, 92.0f)
                arcToRelative(68.0f, 68.0f, 0.0f, false, true, -68.0f, 68.0f)
                horizontalLineTo(76.0f)
                arcTo(44.0f, 44.0f, 0.0f, true, true, 90.2f, 74.34f)
                verticalLineToRelative(0.11f)
                arcTo(68.06f, 68.06f, 0.0f, false, true, 224.0f, 92.0f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(88.0f, 196.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, true, -12.0f, -12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, true, 88.0f, 196.0f)
                close()
                moveTo(116.0f, 200.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 116.0f, 200.0f)
                close()
                moveTo(164.0f, 184.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 164.0f, 184.0f)
                close()
                moveTo(68.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 224.0f)
                close()
                moveTo(156.0f, 224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, true, false, 12.0f, 12.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 156.0f, 224.0f)
                close()
                moveTo(232.0f, 92.0f)
                arcToRelative(76.08f, 76.08f, 0.0f, false, true, -76.0f, 76.0f)
                lineTo(76.0f, 168.0f)
                arcTo(52.0f, 52.0f, 0.0f, false, true, 76.0f, 64.0f)
                arcToRelative(53.26f, 53.26f, 0.0f, false, true, 8.92f, 0.76f)
                arcTo(76.08f, 76.08f, 0.0f, false, true, 232.0f, 92.0f)
                close()
                moveTo(216.0f, 92.0f)
                arcTo(60.06f, 60.06f, 0.0f, false, false, 96.0f, 88.46f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -16.0f, -0.92f)
                quadToRelative(0.21f, -3.66f, 0.77f, -7.23f)
                arcTo(38.11f, 38.11f, 0.0f, false, false, 76.0f, 80.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, false, 0.0f, 72.0f)
                horizontalLineToRelative(80.0f)
                arcTo(60.07f, 60.07f, 0.0f, false, false, 216.0f, 92.0f)
                close()
            }
        }
        .build()
        return _cloudsnow!!
    }

private var _cloudsnow: ImageVector? = null
