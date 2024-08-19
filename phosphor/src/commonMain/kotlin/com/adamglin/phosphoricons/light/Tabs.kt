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

public val LightGroup.Tabs: ImageVector
    get() {
        if (_tabs != null) {
            return _tabs!!
        }
        _tabs = Builder(name = "Tabs", defaultWidth = 256.0.dp, defaultHeight = 256.0.dp,
                viewportWidth = 256.0f, viewportHeight = 256.0f).apply {
            path(fill = SolidColor(Color(0xFF000000)), stroke = null, strokeLineWidth = 0.0f,
                    strokeLineCap = Butt, strokeLineJoin = Miter, strokeLineMiter = 4.0f,
                    pathFillType = NonZero) {
                moveTo(253.75f, 166.28f)
                horizontalLineToRelative(0.0f)
                verticalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.0f)
                lineTo(231.46f, 92.0f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f)
                horizontalLineTo(208.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(10.05f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 220.0f, 95.42f)
                lineToRelative(20.0f, 66.58f)
                horizontalLineTo(204.46f)
                lineToRelative(-21.0f, -70.0f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f)
                horizontalLineTo(160.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 0.0f, 12.0f)
                horizontalLineToRelative(10.05f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 172.0f, 95.42f)
                lineToRelative(20.0f, 66.58f)
                horizontalLineTo(156.46f)
                lineToRelative(-21.0f, -70.0f)
                arcToRelative(13.91f, 13.91f, 0.0f, false, false, -13.41f, -10.0f)
                horizontalLineTo(38.0f)
                arcTo(13.91f, 13.91f, 0.0f, false, false, 24.54f, 92.0f)
                lineTo(2.28f, 166.2f)
                lineToRelative(0.0f, 0.05f)
                verticalLineToRelative(0.0f)
                lineToRelative(0.0f, 0.15f)
                arcToRelative(2.79f, 2.79f, 0.0f, false, false, -0.1f, 0.39f)
                arcToRelative(0.11f, 0.11f, 0.0f, false, false, 0.0f, 0.05f)
                arcTo(6.0f, 6.0f, 0.0f, false, false, 8.0f, 174.0f)
                horizontalLineTo(248.0f)
                arcToRelative(6.0f, 6.0f, 0.0f, false, false, 5.75f, -7.72f)
                close()
                moveTo(36.0f, 95.42f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 38.0f, 94.0f)
                horizontalLineToRelative(84.1f)
                arcTo(2.0f, 2.0f, 0.0f, false, true, 124.0f, 95.43f)
                lineToRelative(20.0f, 66.57f)
                horizontalLineTo(16.06f)
                close()
            }
        }
        .build()
        return _tabs!!
    }

private var _tabs: ImageVector? = null
