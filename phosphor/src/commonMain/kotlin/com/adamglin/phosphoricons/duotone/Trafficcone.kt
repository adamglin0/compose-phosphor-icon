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

public val DuotoneGroup.Trafficcone: ImageVector
    get() {
        if (_trafficcone != null) {
            return _trafficcone!!
        }
        _trafficcone = Builder(name = "Trafficcone", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, fillAlpha = 0.2f, strokeAlpha
                    = 0.2f, strokeLineWidth = 0.0f, strokeLineCap = Butt, strokeLineJoin = Miter,
                    strokeLineMiter = 4.0f, pathFillType = NonZero) {
                moveTo(188.52f, 160.0f)
                horizontalLineToRelative(-121.0f)
                lineTo(89.74f, 96.0f)
                horizontalLineToRelative(76.52f)
                close()
            }
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(232.0f, 208.0f)
                horizontalLineTo(213.69f)
                lineTo(153.42f, 34.75f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 138.31f, 24.0f)
                horizontalLineTo(117.69f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -15.11f, 10.74f)
                lineTo(42.31f, 208.0f)
                horizontalLineTo(24.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, 16.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -16.0f)
                close()
                moveTo(117.69f, 40.0f)
                horizontalLineToRelative(20.62f)
                lineTo(155.0f, 88.0f)
                horizontalLineTo(101.0f)
                close()
                moveTo(95.43f, 104.0f)
                horizontalLineToRelative(65.14f)
                lineToRelative(16.7f, 48.0f)
                horizontalLineTo(78.73f)
                close()
                moveTo(59.25f, 208.0f)
                lineToRelative(13.92f, -40.0f)
                horizontalLineTo(182.83f)
                lineToRelative(13.92f, 40.0f)
                close()
            }
        }
        .build()
        return _trafficcone!!
    }

private var _trafficcone: ImageVector? = null
