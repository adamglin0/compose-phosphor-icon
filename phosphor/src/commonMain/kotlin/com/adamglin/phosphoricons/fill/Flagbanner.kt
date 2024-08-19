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

public val FillGroup.Flagbanner: ImageVector
    get() {
        if (_flagbanner != null) {
            return _flagbanner!!
        }
        _flagbanner = Builder(name = "Flagbanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.22f, 59.44f)
                lineToRelative(-45.63f, 95.82f)
                arcToRelative(3.54f, 3.54f, 0.0f, false, true, -0.16f, 0.34f)
                lineToRelative(-34.21f, 71.84f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, true, -14.44f, -6.88f)
                lineTo(173.62f, 160.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -5.66f, -13.66f)
                lineTo(76.69f, 104.0f)
                lineTo(34.34f, 61.66f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 40.0f, 48.0f)
                horizontalLineTo(232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 7.22f, 11.44f)
                close()
            }
        }
        .build()
        return _flagbanner!!
    }

private var _flagbanner: ImageVector? = null
