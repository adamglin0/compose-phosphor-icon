package com.adamglin.phosphoricons.thin

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.ThinGroup

public val ThinGroup.Flagbanner: ImageVector
    get() {
        if (_flagbanner != null) {
            return _flagbanner!!
        }
        _flagbanner = Builder(name = "Flagbanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.38f, 53.86f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 232.0f, 52.0f)
                horizontalLineTo(40.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, -2.83f, 6.83f)
                lineTo(82.34f, 104.0f)
                lineTo(37.17f, 149.17f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 40.0f, 156.0f)
                horizontalLineTo(180.0f)
                lineToRelative(-31.56f, 66.28f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 1.89f, 5.33f)
                arcTo(3.92f, 3.92f, 0.0f, false, false, 152.0f, 228.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.61f, -2.28f)
                lineToRelative(80.0f, -168.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, false, 235.38f, 53.86f)
                close()
                moveTo(183.76f, 148.0f)
                horizontalLineTo(49.66f)
                lineToRelative(41.17f, -41.17f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, -5.66f)
                lineTo(49.66f, 60.0f)
                horizontalLineToRelative(176.0f)
                close()
            }
        }
        .build()
        return _flagbanner!!
    }

private var _flagbanner: ImageVector? = null
