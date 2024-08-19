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

public val FillGroup.Globehemisphereeast: ImageVector
    get() {
        if (_globehemisphereeast != null) {
            return _globehemisphereeast!!
        }
        _globehemisphereeast = Builder(name = "Globehemisphereeast", defaultWidth = 256.0.dp,
                defaultHeight = 256.0.dp, viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(128.0f, 24.0f)
                arcTo(104.0f, 104.0f, 0.0f, true, false, 232.0f, 128.0f)
                arcTo(104.11f, 104.11f, 0.0f, false, false, 128.0f, 24.0f)
                close()
                moveTo(62.29f, 186.47f)
                lineToRelative(2.52f, -1.65f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 72.0f, 171.53f)
                lineToRelative(0.21f, -36.23f)
                lineTo(93.17f, 104.0f)
                arcToRelative(3.62f, 3.62f, 0.0f, false, false, 0.32f, 0.22f)
                lineToRelative(19.67f, 12.87f)
                arcToRelative(15.94f, 15.94f, 0.0f, false, false, 11.35f, 2.77f)
                lineTo(156.0f, 115.59f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 10.0f, -5.41f)
                lineToRelative(22.17f, -25.76f)
                arcTo(16.0f, 16.0f, 0.0f, false, false, 192.0f, 74.0f)
                verticalLineTo(67.67f)
                arcTo(87.87f, 87.87f, 0.0f, false, true, 211.77f, 155.0f)
                lineToRelative(-16.14f, -14.76f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, -16.93f, -3.0f)
                lineToRelative(-30.46f, 12.65f)
                arcToRelative(16.08f, 16.08f, 0.0f, false, false, -9.68f, 12.45f)
                lineToRelative(-2.39f, 16.19f)
                arcToRelative(16.0f, 16.0f, 0.0f, false, false, 11.77f, 17.81f)
                lineTo(169.4f, 202.0f)
                lineToRelative(2.36f, 2.37f)
                arcTo(87.88f, 87.88f, 0.0f, false, true, 62.29f, 186.47f)
                close()
            }
        }
        .build()
        return _globehemisphereeast!!
    }

private var _globehemisphereeast: ImageVector? = null
