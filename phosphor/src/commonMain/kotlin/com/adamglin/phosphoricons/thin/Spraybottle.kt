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

public val ThinGroup.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) {
            return _sprayBottle!!
        }
        _sprayBottle = Builder(name = "SprayBottle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 76.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 4.0f, -4.0f)
                arcToRelative(52.06f, 52.06f, 0.0f, false, false, -52.0f, -52.0f)
                horizontalLineTo(80.0f)
                arcTo(12.0f, 12.0f, 0.0f, false, false, 68.0f, 32.0f)
                verticalLineTo(80.0f)
                arcToRelative(28.0f, 28.0f, 0.0f, false, true, -28.0f, 28.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 8.0f)
                arcTo(36.0f, 36.0f, 0.0f, false, false, 76.0f, 80.0f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(40.0f)
                verticalLineToRelative(28.62f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, true, -10.51f, 21.86f)
                lineToRelative(-16.0f, 12.79f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 76.0f, 167.38f)
                verticalLineTo(224.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, 12.0f)
                horizontalLineTo(192.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                verticalLineTo(211.47f)
                arcTo(266.86f, 266.86f, 0.0f, false, false, 167.09f, 76.0f)
                close()
                moveTo(76.0f, 32.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, 4.0f, -4.0f)
                horizontalLineToRelative(72.0f)
                arcToRelative(44.06f, 44.06f, 0.0f, false, true, 43.82f, 40.0f)
                horizontalLineTo(76.0f)
                close()
                moveTo(196.0f, 211.47f)
                verticalLineTo(224.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, 4.0f)
                horizontalLineTo(88.0f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, true, -4.0f, -4.0f)
                verticalLineTo(167.38f)
                arcToRelative(27.85f, 27.85f, 0.0f, false, true, 10.51f, -21.86f)
                lineToRelative(16.0f, -12.79f)
                arcTo(35.8f, 35.8f, 0.0f, false, false, 124.0f, 104.62f)
                verticalLineTo(76.0f)
                horizontalLineToRelative(33.76f)
                arcTo(258.83f, 258.83f, 0.0f, false, true, 196.0f, 211.47f)
                close()
            }
        }
        .build()
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
