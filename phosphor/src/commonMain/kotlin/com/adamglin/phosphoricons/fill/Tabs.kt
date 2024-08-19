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

public val FillGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(256.0f, 168.0f)
                arcToRelative(8.0f, 8.0f, 0.0f, false, true, -8.0f, 8.0f)
                horizontalLineTo(8.0f)
                arcTo(8.0f, 8.0f, 0.0f, false, true, 0.37f, 165.6f)
                lineTo(22.63f, 91.4f)
                arcTo(15.89f, 15.89f, 0.0f, false, true, 38.0f, 80.0f)
                horizontalLineToRelative(84.1f)
                arcToRelative(15.89f, 15.89f, 0.0f, false, true, 15.32f, 11.4f)
                lineTo(158.0f, 160.0f)
                horizontalLineToRelative(15.3f)
                lineTo(150.79f, 85.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 154.62f, 80.0f)
                horizontalLineToRelative(15.43f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.32f, 11.4f)
                lineTo(206.0f, 160.0f)
                horizontalLineToRelative(15.3f)
                lineTo(198.79f, 85.15f)
                arcTo(4.0f, 4.0f, 0.0f, false, true, 202.62f, 80.0f)
                horizontalLineToRelative(15.43f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, true, 15.32f, 11.4f)
                lineToRelative(22.26f, 74.18f)
                arcTo(8.11f, 8.11f, 0.0f, false, true, 256.0f, 168.0f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
