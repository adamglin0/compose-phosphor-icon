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

public val FillGroup.Crownsimple: ImageVector
    get() {
        if (_crownsimple != null) {
            return _crownsimple!!
        }
        _crownsimple = Builder(name = "Crownsimple", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(239.75f, 90.81f)
                curveToRelative(0.0f, 0.11f, 0.0f, 0.21f, -0.07f, 0.32f)
                lineTo(217.0f, 195.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -15.72f, 13.0f)
                horizontalLineTo(54.71f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 39.0f, 195.0f)
                lineTo(16.32f, 91.13f)
                curveToRelative(0.0f, -0.11f, -0.05f, -0.21f, -0.07f, -0.32f)
                arcTo(16.0f, 16.0f, 0.0f, false, true, 44.0f, 77.39f)
                lineToRelative(33.67f, 36.29f)
                lineToRelative(35.8f, -80.29f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, -0.1f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 29.06f, 0.0f)
                arcToRelative(1.0f, 1.0f, 0.0f, false, false, 0.0f, 0.1f)
                lineToRelative(35.8f, 80.29f)
                lineTo(212.0f, 77.39f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 27.71f, 13.42f)
                close()
            }
        }
        .build()
        return _crownsimple!!
    }

private var _crownsimple: ImageVector? = null
