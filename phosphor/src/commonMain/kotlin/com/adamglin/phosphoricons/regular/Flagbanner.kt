package com.adamglin.phosphoricons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.RegularGroup

public val RegularGroup.Flagbanner: ImageVector
    get() {
        if (_flagbanner != null) {
            return _flagbanner!!
        }
        _flagbanner = Builder(name = "Flagbanner", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.76f, 51.73f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 232.0f, 48.0f)
                horizontalLineTo(40.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -5.66f, 13.66f)
                lineTo(76.69f, 104.0f)
                lineTo(34.34f, 146.34f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 40.0f, 160.0f)
                horizontalLineTo(173.62f)
                lineToRelative(-28.84f, 60.56f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.44f, 6.88f)
                lineToRelative(80.0f, -168.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 238.76f, 51.73f)
                close()
                moveTo(181.23f, 144.0f)
                horizontalLineTo(59.31f)
                lineToRelative(34.35f, -34.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 0.0f, -11.32f)
                lineTo(59.31f, 64.0f)
                horizontalLineToRelative(160.0f)
                close()
            }
        }
        .build()
        return _flagbanner!!
    }

private var _flagbanner: ImageVector? = null
