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

public val BoldGroup.CircleHalfTilt: ImageVector
    get() {
        if (_circleHalfTilt != null) {
            return _circleHalfTilt!!
        }
        _circleHalfTilt = Builder(name = "CircleHalfTilt", defaultWidth = 24.0.dp, defaultHeight =
                24.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(204.37f, 51.6f)
                arcTo(108.08f, 108.08f, 0.0f, true, false, 236.0f, 128.0f)
                arcTo(108.09f, 108.09f, 0.0f, false, false, 204.37f, 51.6f)
                close()
                moveTo(176.0f, 197.0f)
                arcToRelative(83.43f, 83.43f, 0.0f, false, true, -16.0f, 8.75f)
                lineTo(160.0f, 113.0f)
                lineToRelative(16.0f, -16.0f)
                close()
                moveTo(68.6f, 68.58f)
                arcTo(84.08f, 84.08f, 0.0f, false, true, 178.3f, 60.7f)
                lineTo(60.72f, 178.33f)
                arcTo(84.08f, 84.08f, 0.0f, false, true, 68.6f, 68.58f)
                close()
                moveTo(96.0f, 177.0f)
                verticalLineToRelative(28.69f)
                arcTo(83.63f, 83.63f, 0.0f, false, true, 77.7f, 195.3f)
                close()
                moveTo(120.0f, 211.62f)
                lineTo(120.0f, 153.0f)
                lineToRelative(16.0f, -16.0f)
                verticalLineToRelative(74.64f)
                arcTo(84.68f, 84.68f, 0.0f, false, true, 120.0f, 211.62f)
                close()
                moveTo(200.0f, 171.35f)
                lineTo(200.0f, 84.65f)
                arcToRelative(84.24f, 84.24f, 0.0f, false, true, 0.0f, 86.7f)
                close()
            }
        }
        .build()
        return _circleHalfTilt!!
    }

private var _circleHalfTilt: ImageVector? = null
