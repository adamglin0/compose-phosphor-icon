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

public val FillGroup.Lightbulbfilament: ImageVector
    get() {
        if (_lightbulbfilament != null) {
            return _lightbulbfilament!!
        }
        _lightbulbfilament = Builder(name = "Lightbulbfilament", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(176.0f, 232.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                lineTo(88.0f, 240.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 0.0f, -16.0f)
                horizontalLineToRelative(80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 176.0f, 232.0f)
                close()
                moveTo(216.0f, 104.0f)
                arcToRelative(87.55f, 87.55f, 0.0f, false, true, -33.64f, 69.21f)
                arcTo(16.24f, 16.24f, 0.0f, false, false, 176.0f, 186.0f)
                verticalLineToRelative(6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, 16.0f)
                lineTo(96.0f, 208.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, -16.0f, -16.0f)
                verticalLineToRelative(-6.0f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -6.23f, -12.66f)
                arcTo(87.59f, 87.59f, 0.0f, false, true, 40.0f, 104.49f)
                curveTo(39.74f, 56.83f, 78.26f, 17.14f, 125.88f, 16.0f)
                arcTo(88.0f, 88.0f, 0.0f, false, true, 216.0f, 104.0f)
                close()
                moveTo(165.66f, 106.34f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 0.0f)
                lineTo(128.0f, 132.69f)
                lineToRelative(-26.34f, -26.35f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, -11.32f, 11.32f)
                lineTo(120.0f, 147.31f)
                lineTo(120.0f, 184.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 16.0f, 0.0f)
                lineTo(136.0f, 147.31f)
                lineToRelative(29.66f, -29.65f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 165.66f, 106.34f)
                close()
            }
        }
        .build()
        return _lightbulbfilament!!
    }

private var _lightbulbfilament: ImageVector? = null
