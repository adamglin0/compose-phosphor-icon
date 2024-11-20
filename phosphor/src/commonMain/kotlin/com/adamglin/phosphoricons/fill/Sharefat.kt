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

public val FillGroup.ShareFat: ImageVector
    get() {
        if (_shareFat != null) {
            return _shareFat!!
        }
        _shareFat = Builder(name = "ShareFat", defaultWidth = 24.0.dp, defaultHeight = 24.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(237.66f, 117.66f)
                lineToRelative(-80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 144.0f, 192.0f)
                verticalLineTo(152.23f)
                curveToRelative(-57.1f, 3.24f, -96.25f, 40.27f, -107.24f, 52.0f)
                horizontalLineToRelative(0.0f)
                arcToRelative(12.0f, 12.0f, 0.0f, false, true, -20.68f, -9.58f)
                curveToRelative(3.71f, -32.26f, 21.38f, -63.29f, 49.76f, -87.37f)
                curveToRelative(23.57f, -20.0f, 52.22f, -32.69f, 78.16f, -34.91f)
                verticalLineTo(32.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, 13.66f, -5.66f)
                lineToRelative(80.0f, 80.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 237.66f, 117.66f)
                close()
            }
        }
        .build()
        return _shareFat!!
    }

private var _shareFat: ImageVector? = null
