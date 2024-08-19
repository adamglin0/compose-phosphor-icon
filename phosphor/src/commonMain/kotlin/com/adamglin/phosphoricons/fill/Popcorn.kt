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

public val FillGroup.Popcorn: ImageVector
    get() {
        if (_popcorn != null) {
            return _popcorn!!
        }
        _popcorn = Builder(name = "Popcorn", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(229.52f, 74.21f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -7.13f, -2.0f)
                arcTo(44.0f, 44.0f, 0.0f, false, false, 168.0f, 41.67f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -80.0f, 0.0f)
                arcToRelative(44.0f, 44.0f, 0.0f, false, false, -54.4f, 30.51f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -9.4f, 9.65f)
                lineTo(54.76f, 211.67f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 70.34f, 224.0f)
                horizontalLineTo(185.66f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 15.58f, -12.33f)
                lineTo(231.79f, 81.83f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 229.52f, 74.21f)
                close()
                moveTo(70.34f, 208.0f)
                lineTo(42.91f, 91.44f)
                lineToRelative(37.85f, 10.81f)
                lineTo(94.86f, 208.0f)
                close()
                moveTo(122.06f, 73.76f)
                lineTo(87.57f, 87.56f)
                lineTo(49.0f, 76.54f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 40.1f, -17.28f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.56f, -5.34f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, 54.66f, 0.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 11.56f, 5.34f)
                arcTo(28.0f, 28.0f, 0.0f, false, true, 207.0f, 76.54f)
                lineToRelative(-38.56f, 11.0f)
                lineToRelative(-34.49f, -13.8f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 122.06f, 73.76f)
                close()
                moveTo(185.66f, 208.0f)
                horizontalLineTo(161.14f)
                lineToRelative(14.1f, -105.75f)
                lineToRelative(37.85f, -10.81f)
                close()
            }
        }
        .build()
        return _popcorn!!
    }

private var _popcorn: ImageVector? = null
