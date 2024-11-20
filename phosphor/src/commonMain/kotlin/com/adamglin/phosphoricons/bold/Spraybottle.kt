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

public val BoldGroup.SprayBottle: ImageVector
    get() {
        if (_sprayBottle != null) {
            return _sprayBottle!!
        }
        _sprayBottle = Builder(name = "SprayBottle", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(200.0f, 84.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 12.0f, -12.0f)
                arcToRelative(60.07f, 60.07f, 0.0f, false, false, -60.0f, -60.0f)
                horizontalLineTo(80.0f)
                arcTo(20.0f, 20.0f, 0.0f, false, false, 60.0f, 32.0f)
                verticalLineTo(80.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, true, -20.0f, 20.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, false, 0.0f, 24.0f)
                arcTo(44.06f, 44.06f, 0.0f, false, false, 83.82f, 84.0f)
                horizontalLineTo(108.0f)
                verticalLineToRelative(20.62f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, -7.51f, 15.62f)
                lineTo(84.51f, 133.0f)
                arcTo(43.8f, 43.8f, 0.0f, false, false, 68.0f, 167.38f)
                verticalLineTo(224.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, 20.0f)
                horizontalLineTo(192.0f)
                arcToRelative(20.0f, 20.0f, 0.0f, false, false, 20.0f, -20.0f)
                verticalLineTo(211.47f)
                arcTo(274.77f, 274.77f, 0.0f, false, false, 180.68f, 84.0f)
                close()
                moveTo(84.0f, 36.0f)
                horizontalLineToRelative(68.0f)
                arcToRelative(36.0f, 36.0f, 0.0f, false, true, 33.94f, 24.0f)
                horizontalLineTo(84.0f)
                close()
                moveTo(188.0f, 211.47f)
                verticalLineTo(220.0f)
                horizontalLineTo(92.0f)
                verticalLineTo(167.38f)
                arcToRelative(19.92f, 19.92f, 0.0f, false, true, 7.51f, -15.62f)
                lineToRelative(16.0f, -12.78f)
                arcTo(43.8f, 43.8f, 0.0f, false, false, 132.0f, 104.62f)
                verticalLineTo(84.0f)
                horizontalLineToRelative(21.24f)
                arcTo(250.93f, 250.93f, 0.0f, false, true, 188.0f, 211.47f)
                close()
            }
        }
        .build()
        return _sprayBottle!!
    }

private var _sprayBottle: ImageVector? = null
