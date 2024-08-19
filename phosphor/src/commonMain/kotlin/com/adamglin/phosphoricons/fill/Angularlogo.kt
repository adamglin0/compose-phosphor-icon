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

public val FillGroup.Angularlogo: ImageVector
    get() {
        if (_angularlogo != null) {
            return _angularlogo!!
        }
        _angularlogo = Builder(name = "Angularlogo", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 104.47f)
                lineTo(141.07f, 128.0f)
                horizontalLineTo(114.93f)
                close()
                moveTo(231.93f, 73.06f)
                lineToRelative(-16.0f, 120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.35f, 6.1f)
                lineToRelative(-80.0f, 40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -7.16f, 0.0f)
                lineToRelative(-80.0f, -40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -4.35f, -6.1f)
                lineToRelative(-16.0f, -120.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 4.85f, -8.44f)
                lineToRelative(96.0f, -40.0f)
                arcToRelative(7.93f, 7.93f, 0.0f, false, true, 6.16f, 0.0f)
                lineToRelative(96.0f, 40.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 231.93f, 73.06f)
                close()
                moveTo(175.0f, 156.12f)
                lineToRelative(-40.0f, -72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -14.0f, 0.0f)
                lineToRelative(-40.0f, 72.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, 7.76f)
                lineTo(106.0f, 144.0f)
                horizontalLineTo(150.0f)
                lineToRelative(11.0f, 19.88f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.0f, -7.76f)
                close()
            }
        }
        .build()
        return _angularlogo!!
    }

private var _angularlogo: ImageVector? = null
