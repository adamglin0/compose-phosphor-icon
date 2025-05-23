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

public val LightGroup.Warning: ImageVector
    get() {
        if (_warning != null) {
            return _warning!!
        }
        _warning = Builder(name = "Warning", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(235.07f, 189.09f)
                lineTo(147.61f, 37.22f)
                horizontalLineToRelative(0.0f)
                arcToRelative(22.75f, 22.75f, 0.0f, false, false, -39.22f, 0.0f)
                lineTo(20.93f, 189.09f)
                arcToRelative(21.53f, 21.53f, 0.0f, false, false, 0.0f, 21.72f)
                arcTo(22.35f, 22.35f, 0.0f, false, false, 40.55f, 222.0f)
                horizontalLineToRelative(174.9f)
                arcToRelative(22.35f, 22.35f, 0.0f, false, false, 19.6f, -11.19f)
                arcTo(21.53f, 21.53f, 0.0f, false, false, 235.07f, 189.09f)
                close()
                moveTo(224.66f, 204.8f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, 5.2f)
                lineTo(40.55f, 210.0f)
                arcToRelative(10.46f, 10.46f, 0.0f, false, true, -9.21f, -5.2f)
                arcToRelative(9.51f, 9.51f, 0.0f, false, true, 0.0f, -9.72f)
                lineTo(118.79f, 43.21f)
                arcToRelative(10.75f, 10.75f, 0.0f, false, true, 18.42f, 0.0f)
                lineToRelative(87.46f, 151.87f)
                arcTo(9.51f, 9.51f, 0.0f, false, true, 224.66f, 204.8f)
                close()
                moveTo(122.0f, 144.0f)
                lineTo(122.0f, 104.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, 12.0f, 0.0f)
                verticalLineToRelative(40.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, true, -12.0f, 0.0f)
                close()
                moveTo(138.0f, 180.0f)
                arcToRelative(10.0f, 10.0f, 0.0f, true, true, -10.0f, -10.0f)
                arcTo(10.0f, 10.0f, 0.0f, false, true, 138.0f, 180.0f)
                close()
            }
        }
        .build()
        return _warning!!
    }

private var _warning: ImageVector? = null
