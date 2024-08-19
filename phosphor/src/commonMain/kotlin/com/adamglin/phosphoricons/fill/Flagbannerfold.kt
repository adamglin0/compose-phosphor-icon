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

public val FillGroup.Flagbannerfold: ImageVector
    get() {
        if (_flagbannerfold != null) {
            return _flagbannerfold!!
        }
        _flagbannerfold = Builder(name = "Flagbannerfold", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(131.79f, 69.65f)
                lineToRelative(-43.63f, 96.0f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 84.52f, 168.0f)
                horizontalLineTo(28.23f)
                arcToRelative(8.2f, 8.2f, 0.0f, false, true, -6.58f, -3.13f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.43f, -10.25f)
                lineTo(57.19f, 116.0f)
                lineTo(22.08f, 77.38f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -0.43f, -10.26f)
                arcTo(8.22f, 8.22f, 0.0f, false, true, 28.23f, 64.0f)
                horizontalLineToRelative(99.92f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 131.79f, 69.65f)
                close()
                moveTo(237.56f, 42.24f)
                arcTo(8.3f, 8.3f, 0.0f, false, false, 231.77f, 40.0f)
                horizontalLineTo(168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.28f, 4.69f)
                lineToRelative(-42.57f, 93.65f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 3.64f, 5.66f)
                horizontalLineToRelative(57.79f)
                lineToRelative(-34.86f, 76.69f)
                arcToRelative(8.0f, 8.0f, 0.0f, true, false, 14.56f, 6.62f)
                lineToRelative(80.0f, -176.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 237.56f, 42.24f)
                close()
            }
        }
        .build()
        return _flagbannerfold!!
    }

private var _flagbannerfold: ImageVector? = null
