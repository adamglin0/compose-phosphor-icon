package com.adamglin.phosphoricons.bold

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.BoldGroup

public val BoldGroup.HouseSimple: ImageVector
    get() {
        if (_houseSimple != null) {
            return _houseSimple!!
        }
        _houseSimple = Builder(name = "HouseSimple", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(222.14f, 105.85f)
                lineToRelative(-80.0f, -80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, -28.28f, 0.0f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 28.0f, 120.0f)
                verticalLineToRelative(96.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(216.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(120.0f)
                arcTo(19.86f, 19.86f, 0.0f, false, false, 222.14f, 105.85f)
                close()
                moveTo(204.0f, 204.0f)
                horizontalLineTo(52.0f)
                verticalLineTo(121.65f)
                lineToRelative(76.0f, -76.0f)
                lineToRelative(76.0f, 76.0f)
                close()
            }
        }
        .build()
        return _houseSimple!!
    }

private var _houseSimple: ImageVector? = null
