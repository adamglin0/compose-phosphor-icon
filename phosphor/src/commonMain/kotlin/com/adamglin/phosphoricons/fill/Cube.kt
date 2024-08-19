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

public val FillGroup.Cube: ImageVector
    get() {
        if (_cube != null) {
            return _cube!!
        }
        _cube = Builder(name = "Cube", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(223.68f, 66.15f)
                lineTo(135.68f, 18.0f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, -15.36f, 0.0f)
                lineToRelative(-88.0f, 48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -8.32f, 14.0f)
                verticalLineToRelative(95.64f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, 14.0f)
                lineToRelative(88.0f, 48.17f)
                arcToRelative(15.88f, 15.88f, 0.0f, false, false, 15.36f, 0.0f)
                lineToRelative(88.0f, -48.17f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 8.32f, -14.0f)
                lineTo(232.0f, 80.18f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 223.68f, 66.15f)
                close()
                moveTo(128.0f, 120.0f)
                lineTo(47.65f, 76.0f)
                lineTo(128.0f, 32.0f)
                lineToRelative(80.35f, 44.0f)
                close()
                moveTo(136.0f, 219.64f)
                lineTo(136.0f, 133.83f)
                lineToRelative(80.0f, -43.78f)
                verticalLineToRelative(85.76f)
                close()
            }
        }
        .build()
        return _cube!!
    }

private var _cube: ImageVector? = null
