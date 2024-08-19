package com.adamglin.phosphoricons.light

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PathFillType.Companion.NonZero
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.StrokeCap.Companion.Butt
import androidx.compose.ui.graphics.StrokeJoin.Companion.Miter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.ImageVector.Builder
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.adamglin.phosphoricons.LightGroup

public val LightGroup.Fliphorizontal: ImageVector
    get() {
        if (_fliphorizontal != null) {
            return _fliphorizontal!!
        }
        _fliphorizontal = Builder(name = "Fliphorizontal", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(106.78f, 26.29f)
                arcTo(13.88f, 13.88f, 0.0f, false, false, 91.1f, 34.55f)
                reflectiveCurveToRelative(0.0f, 0.08f, 0.0f, 0.12f)
                lineToRelative(-64.0f, 159.94f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 40.0f, 214.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, -14.0f)
                lineTo(118.0f, 40.0f)
                arcTo(13.87f, 13.87f, 0.0f, false, false, 106.78f, 26.29f)
                close()
                moveTo(106.0f, 200.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, 2.0f)
                lineTo(40.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -1.85f, -2.78f)
                lineToRelative(0.05f, -0.11f)
                lineToRelative(64.0f, -159.92f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 106.0f, 40.0f)
                close()
                moveTo(228.92f, 194.61f)
                lineTo(164.92f, 34.67f)
                reflectiveCurveToRelative(0.0f, -0.08f, 0.0f, -0.12f)
                arcTo(14.0f, 14.0f, 0.0f, false, false, 138.0f, 40.0f)
                lineTo(138.0f, 200.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 14.0f, 14.0f)
                horizontalLineToRelative(64.0f)
                arcToRelative(14.0f, 14.0f, 0.0f, false, false, 12.93f, -19.39f)
                close()
                moveTo(217.66f, 201.1f)
                arcToRelative(1.93f, 1.93f, 0.0f, false, true, -1.67f, 0.9f)
                lineTo(152.0f, 202.0f)
                arcToRelative(2.0f, 2.0f, 0.0f, false, true, -2.0f, -2.0f)
                lineTo(150.0f, 40.0f)
                arcToRelative(1.82f, 1.82f, 0.0f, false, true, 1.6f, -2.0f)
                arcToRelative(2.62f, 2.62f, 0.0f, false, true, 0.54f, -0.06f)
                arcToRelative(1.76f, 1.76f, 0.0f, false, true, 1.69f, 1.2f)
                lineToRelative(64.0f, 159.92f)
                lineToRelative(0.05f, 0.11f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 217.66f, 201.1f)
                close()
            }
        }
        .build()
        return _fliphorizontal!!
    }

private var _fliphorizontal: ImageVector? = null
