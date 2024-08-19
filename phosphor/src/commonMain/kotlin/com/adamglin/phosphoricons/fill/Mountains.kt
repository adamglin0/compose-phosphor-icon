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

public val FillGroup.Mountains: ImageVector
    get() {
        if (_mountains != null) {
            return _mountains!!
        }
        _mountains = Builder(name = "Mountains", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(254.88f, 195.92f)
                lineToRelative(-54.56f, -92.08f)
                arcTo(15.87f, 15.87f, 0.0f, false, false, 186.55f, 96.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(15.85f, 15.85f, 0.0f, false, false, -13.76f, 7.84f)
                lineToRelative(-15.64f, 26.39f)
                arcToRelative(4.0f, 4.0f, 0.0f, false, false, 0.0f, 4.07f)
                lineToRelative(26.8f, 45.47f)
                arcToRelative(8.13f, 8.13f, 0.0f, false, true, -1.89f, 10.55f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -11.8f, -2.26f)
                lineTo(101.79f, 71.88f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -27.58f, 0.0f)
                lineTo(1.11f, 195.94f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, false, 1.0f, 9.52f)
                arcTo(8.23f, 8.23f, 0.0f, false, false, 8.23f, 208.0f)
                horizontalLineTo(247.77f)
                arcToRelative(8.29f, 8.29f, 0.0f, false, false, 6.09f, -2.55f)
                arcTo(8.0f, 8.0f, 0.0f, false, false, 254.88f, 195.92f)
                close()
                moveTo(64.43f, 120.0f)
                lineTo(88.0f, 80.0f)
                lineToRelative(23.57f, 40.0f)
                close()
                moveTo(140.0f, 52.0f)
                arcToRelative(24.0f, 24.0f, 0.0f, true, true, 24.0f, 24.0f)
                arcTo(24.0f, 24.0f, 0.0f, false, true, 140.0f, 52.0f)
                close()
            }
        }
        .build()
        return _mountains!!
    }

private var _mountains: ImageVector? = null
