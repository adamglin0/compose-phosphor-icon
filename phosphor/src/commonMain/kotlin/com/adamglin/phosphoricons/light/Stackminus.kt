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

public val LightGroup.Stackminus: ImageVector
    get() {
        if (_stackminus != null) {
            return _stackminus!!
        }
        _stackminus = Builder(name = "Stackminus", defaultWidth = 256.0.dp, defaultHeight =
                256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(238.0f, 200.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 6.0f)
                lineTo(184.0f, 206.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, -12.0f)
                horizontalLineToRelative(48.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 238.0f, 200.0f)
                close()
                moveTo(221.0f, 122.82f)
                lineTo(128.0f, 177.05f)
                lineTo(35.0f, 122.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.36f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.36f)
                close()
                moveTo(26.0f, 80.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 3.0f, -5.18f)
                lineToRelative(96.0f, -56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 6.0f, 0.0f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 0.0f, 10.36f)
                lineToRelative(-96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -6.0f, 0.0f)
                lineToRelative(-96.0f, -56.0f)
                arcTo(6.0f, 6.0f, 0.0f, false, true, 26.0f, 80.0f)
                close()
                moveTo(43.91f, 80.0f)
                lineTo(128.0f, 129.05f)
                lineTo(212.09f, 80.0f)
                lineTo(128.0f, 31.0f)
                close()
                moveTo(141.0f, 217.48f)
                lineToRelative(-13.0f, 7.57f)
                lineTo(35.0f, 170.82f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, 10.36f)
                lineToRelative(96.0f, 56.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 6.0f, 0.0f)
                lineToRelative(16.0f, -9.33f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, -6.0f, -10.37f)
                close()
            }
        }
        .build()
        return _stackminus!!
    }

private var _stackminus: ImageVector? = null
